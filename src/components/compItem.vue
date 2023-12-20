<template>
  <div>
    <div v-for="index in 4" :key="index" class="comp-item">
      <div class="intro-details-section">
        <div class="intro-section">
          <h2>{{ toolData[index-1].title }}</h2>
          <p v-html="addLineBreaks(toolData[index-1].intro)"></p>
        </div>
        <div class="details-section">
          <h2>工具详情</h2>
          <ul>
            <li>
              <strong>详细介绍:</strong>
              <span v-html="addLineBreaks(toolData[index-1].details)"></span>
            </li>
          </ul>
        </div>
        <div class="button-section">
          <router-link :to="{ name: 'compDetail' + index, params: { id: 'detail' + index } }">
            <el-button type="primary">查看工具详情{{ index }}</el-button>
          </router-link>
        </div>
      </div>
      <div class="illustration-section">
        <div class="image-container">
          <h2 class="illustration-title">示意图</h2>
          <img :src="toolData[index-1].illustration" alt="示意图">
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      toolData: [
        {
          title: "漏洞挖掘工具-FUZZ",
          intro: "工具介绍:该工具使用了abcdefg的技术能够defg达成fgabc",
          details: "工具使用方法介绍：首先点击按钮进入工具详情页面，进行\nbalabala操作,然后balabala最后balabala就可以实现balabal",
          illustration: require("../../static/fuzz1.png"),
          toolId: "工具ID1",
        },
        {
          title: "漏洞挖掘工具-ANGR",
          intro: "工具介绍:该工具使用了abcdefg的技术能够defg达成fgabc",
          details: "工具使用方法介绍：首先点击按钮进入工具详情页面，进行\nbalabala操作,然后balabala最后balabala就可以实现balabal",
          illustration: require("../../static/fuzz1.png"),
          toolId: "工具ID2",
        },
        {
          title: "漏洞挖掘工具-KLEE",
          intro: "工具介绍:该工具使用了abcdefg的技术能够defg达成fgabc",
          details: "工具使用方法介绍：首先点击按钮进入工具详情页面，进行\nbalabala操作,然后balabala最后balabala就可以实现balabal",
          illustration: require("../../static/fuzz1.png"),
          toolId: "工具ID3",
        },
        {
          title: "漏洞挖掘工具-AFL",
          intro: "工具介绍:该工具使用了abcdefg的技术能够defg达成fgabc",
          details: "工具使用方法介绍：首先点击按钮进入工具详情页面，进行\nbalabala操作,然后balabala最后balabala就可以实现balabal",
          illustration: require("../../static/fuzz1.png"),
          toolId: "工具ID4",
        },
      ],
    };
  },
  methods: {
    addLineBreaks(text) {
      // 在换行符前面插入 <br> 标签
      return text.replace(/\n/g, '<br>');
    },
  },
};
</script>

<style scoped>
.comp-item {
  display: flex;
  padding: 20px;
  border: 1px solid #ddd;
  margin-bottom: 20px;
  background-color: #ddeab2; /* 明亮的绿色 */
}

.intro-details-section {
  flex: 1;
  display: flex;
  flex-direction: column;
  margin-right: 20px;
}

.intro-section,
.details-section,
.button-section {
  margin-bottom: 20px;
}

.illustration-section {
  width: 500px; /* 固定示意图的宽度，你可以根据需要调整 */
}

.image-container {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.illustration-title {
  margin-bottom: 10px;
}

.image-container img {
  max-width: 100%;
  height: auto;
}
</style>