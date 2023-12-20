<template>
    <div class="comp-item">
      <!-- 漏洞挖掘工具的简介 -->
      <div class="intro-section">
        <h2>{{ title }}</h2>
        <p>{{ intro }}</p>
      </div>
  
      <!-- 工具详情介绍模块 -->
      <div class="details-section">
        <h2>工具详情</h2>
        <ul>
          <li><strong>详细介绍:</strong> {{ details }}</li>
        </ul>
      </div>
  
      <!-- 示例图 -->
      <div class="illustration-section">
        <h2>示意图</h2>
        <img :src="illustration" alt="示意图">
      </div>
  
      <!-- 跳转按钮 -->
      <div class="button-section">
        <router-link :to="{ name: 'toolDetailVue', params: { id: toolId } }">
          <el-button type="primary">查看工具详情</el-button>
        </router-link>
      </div>
    </div>
  </template>
  
  <script>
  export default {
    props: {
      title: String,
      intro: String,
      details: String,
      illustration: String,
      toolId: String, // 传递工具的唯一标识符
    },
    methods: {
      redirectToToolPage() {
        // 在这里添加跳转的逻辑，可以使用路由等方式进行页面跳转
        console.log(`跳转到${this.title}的工具详情页面`);
      },
    },
  };
  </script>
  
  <style scoped>
  .comp-item {
    padding: 20px;
    border: 1px solid #ddd;
    margin-bottom: 20px;
  }
  
  /* 可根据需要调整样式 */
  .intro-section,
  .details-section,
  .illustration-section,
  .button-section {
    margin-bottom: 20px;
  }
  </style>
  