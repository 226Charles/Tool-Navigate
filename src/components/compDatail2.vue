<template>
  <div class="page-container">
    <h1>{{ title }}</h1>
    <!-- compDetail1.vue 的其他内容 -->
    <router-link to="/" class="router-link">
      <el-button type="default" class="custom-button">返回根目录</el-button>
    </router-link>

    <!-- 新增按钮，打开外部链接 -->
    <a href="https://example.com" target="_blank" class="custom-button external-link-button">
      <el-button type="primary">跳转到工具</el-button>
    </a>
  </div>
</template>

<script>
export default {
  data() {
    return {
      title: "漏洞挖掘工具-ANGR",
      // ... (其他 data 属性)
    };
  },
  // ... (其他 script 方法、生命周期钩子等)
};
</script>

<style scoped>
/* 这里放你的组件样式 */

/* 自定义按钮样式，去掉下划线 */
.custom-button {
  text-decoration: none !important;
}

/* 页面容器样式，添加背景颜色等装饰性内容 */
.page-container {
  padding: 20px;
  background-color: #f5f5f5; /* 举例的背景颜色 */
  border: 1px solid #ddd; /* 举例的边框 */
  border-radius: 5px; /* 举例的圆角 */
}

/* 调整按钮之间的间距 */
.el-button {
  display: block;
  margin-bottom: 10px;
}

/* 单独为外部链接按钮添加样式 */
.external-link-button {
  /* 去掉<a>标签的下划线 */
  text-decoration: none !important;
}

/* 为router-link添加样式 */
.router-link {
  /* 去掉<a>标签的下划线 */
  text-decoration: none !important;
}
</style>
