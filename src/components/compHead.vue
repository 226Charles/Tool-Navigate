<template>
    <div class="header">
      <h1>{{ title }}</h1>
    </div>
  </template>
  
  <script>
  export default {
    props: {
      title: {
        type: String,
        default: "工具整合",
      },
    },
  };
  </script>
  
  <style scoped>
  .header {
    background-color: #3498db; /* 背景色 */
    color: #fff; /* 字体颜色 */
    text-align: center; /* 文本居中 */
    padding: 20px; /* 内边距 */
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1); /* 阴影效果 */
    transition: background-color 0.3s ease; /* 过渡效果 */
  
    /* 设置最大高度并隐藏溢出内容 */
    max-height: 40px; /* 适当设置合适的最大高度 */
    overflow: hidden;
  
    /* 添加鼠标悬停效果 */
    cursor: pointer;
  }
  
  .header:hover {
    background-color: #2980b9; /* 鼠标悬停时的背景色 */
  }
  </style>
  