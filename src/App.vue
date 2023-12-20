<template>
  <div id="app">
    <el-container>
      <el-header>
        <compHead></compHead>
      </el-header>

      <el-container>
        <el-aside :width="sidebarWidth" class="custom-aside">
          <compNavi></compNavi>
        </el-aside>

        <el-main>
          <el-row :gutter="20">
            <el-col :span="24" :lg="{ span: 18 }">
              <router-view></router-view>
            </el-col>
          </el-row>
        </el-main>
      </el-container>

      <el-footer style="height: 60px;">
        <compFoot></compFoot>
      </el-footer>
    </el-container>
  </div>
</template>

<script>
import compNavi from './components/compNavi.vue'
import compHead from './components/compHead.vue'
import compFoot from './components/compFoot.vue'

export default {
  name: 'App',
  components: {
    compNavi,
    compHead,
    compFoot,
  },
  data() {
    return {
      sidebarWidth: '15%', // 侧边栏宽度设置为15%
      showCompItem: true,
      detailNumber: null,
    };
  },
  methods: {
    toggleShowDetails(detailNumber) {
      this.showCompItem = false;
      this.detailNumber = detailNumber;
    },
    returnToCompItem() {
      this.showCompItem = true;
    },
  },
};
</script>

<style>
#app {
  height: 100vh;
  display: flex;
  flex-direction: column;
}
.custom-aside {
  background-color: #e6f7ff; /* 淡蓝色背景，可以根据需要调整颜色值 */
  border-radius: 10px; /* 圆角，根据需要调整 */
  padding: 20px; /* 内边距，根据需要调整 */
  box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1); /* 添加一点阴影效果 */
  margin-top: 20px; /* 调整侧边栏上方的间距 */
}

.el-main {
  padding: 20px; /* 可根据需要调整内边距 */
}

.el-footer {
  flex: 0 0 auto; /* 固定高度，不占剩余空间 */
}
</style>
