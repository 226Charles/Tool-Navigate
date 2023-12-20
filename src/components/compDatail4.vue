<template>
  <div class="container">
    <h1>{{ title }}</h1>

    <!-- 第一行按钮 -->
    <div class="button-row">
      <router-link to="/">
        <el-button type="default">返回根目录</el-button>
      </router-link>
    </div>

    <!-- 第二行进度条 -->
    <div class="progress-row">
      <el-steps :active="currentStep">
        <el-step title="步骤 1：获取后端数据" description="首先获取源码待测目录"></el-step>
        <el-step title="步骤 2：选择待测目录" description="检验时间较长需1分钟左右"></el-step>
        <el-step title="步骤 3：结果输出" description="输出最终结果"></el-step>
      </el-steps>
    </div>

    <!-- 第三行获取后端数据 -->
    <div class="data-fetch-row">
      <el-button type="primary" @click="fetchData" :disabled="currentStep !== 0">获取待测目录</el-button>
      <div v-if="responseData">
        <h2>后端返回的数据：</h2>
        <pre>{{ responseData }}</pre>
      </div>
    </div>

    <!-- 最后一行发送选中文件和文件选择框 -->
    <div class="file-selection-row">
      <el-button type="primary" @click="sendSelectedFile" :disabled="currentStep < 1 || currentStep > 1">发送选中目录</el-button>
      <el-select v-model="selectedFile" placeholder="请选择文件" :disabled="currentStep < 1">
        <el-option v-for="file in files" :key="file" :label="file" :value="file"></el-option>
      </el-select>
    </div>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      title: "工具标题4",
      responseData: null,
      files: [], // 存储文件列表
      selectedFile: null, // 存储选择的文件名
      currentStep: 0, // 当前进行到的步骤，初始为 0
    };
  },
  methods: {
    // 点击按钮时触发的方法，获取文件列表
    fetchData() {
      axios.get('http://localhost:8086/api/dir')
        .then(response => {
          // 请求成功，将后端返回的文件列表存储在 files 中
          this.files = response.data;
          // 更新步骤为 1
          this.currentStep = 1;
        })
        .catch(error => {
          // 请求失败，处理错误
          console.error('请求失败', error);
        });
    },
    // 点击第二个按钮时触发的方法，发送包含选中文件名的请求
    sendSelectedFile() {
      if (this.selectedFile) {
        axios.get(`http://localhost:8086/api/detail4?fileName=${this.selectedFile}`)
          .then(response => {
            // 请求成功，将后端返回的数据存储在 responseData 中
            this.responseData = JSON.stringify(response.data, null, 2);
            // 更新步骤为 2
            this.currentStep = 2;
          })
          .catch(error => {
            // 请求失败，处理错误
            console.error('请求失败', error);
          });
      } else {
        console.error('请选择文件');
      }
    },
  },
};
</script>

<style scoped>
.container {
  padding: 20px;
  border: 1px solid #ddd;
  margin-bottom: 20px;
}

.button-row,
.progress-row,
.data-fetch-row,
.file-selection-row {
  margin-bottom: 20px;
}
</style>
