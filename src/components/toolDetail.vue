<!-- toolDetail.vue -->
<template>
    <div>
      <h1>工具详情页</h1>
      <p>工具ID：{{ $route.params.id }}</p>
      <div v-if="tool">
        <!-- 显示工具的详细信息 -->
        <h2>{{ tool.name }}</h2>
        <p>{{ tool.description }}</p>
        <!-- 其他工具详细信息 -->
      </div>
      <div v-else>
        <p>Loading...</p>
      </div>
    </div>
  </template>
  
  <script>
  export default {
    data() {
      return {
        tool: null,
      };
    },
    created() {
      // 在组件创建时获取工具详细信息
      this.fetchToolDetails();
    },
    methods: {
      fetchToolDetails() {
        // 这里可以使用工具的唯一标识符从数据源中获取详细信息
        const toolId = this.$route.params.id;
  
        // 假设有一个 tools 数据源，其中存储了工具的详细信息
        // 实际应用中需要替换成从后端或其他数据源获取数据的逻辑
        const tools = [
          { id: 'tool1', name: '工具1', description: '这是工具1的详细描述。' },
          { id: 'tool2', name: '工具2', description: '这是工具2的详细描述。' },
          // 可以添加更多工具的详细信息
        ];
  
        // 查找与工具ID匹配的工具
        this.tool = tools.find(tool => tool.id === toolId);
      },
    },
  };
  </script>
  