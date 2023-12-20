<template>
  <div>
    <el-row class="tac" style="margin-bottom: 20px;">
      <div class="user-info">
        <img src="../../static/pic1.jpg" alt="头像" class="avatar">
        <h1 style="margin: 10,0; font-size: 20px; color: #333;" class="username">漏洞挖掘工具</h1>
      </div>
      
      <el-col :span="24">
        <el-menu
          default-active="1"
          class="el-menu-vertical-demo"
          @open="handleOpen"
          @close="handleClose"
          background-color="#545c64"
          text-color="#fff"
          active-text-color="#ffd04b">
          <router-link to="/detail1" style="text-decoration: none;">
            <el-menu-item index="1">
                <i class="el-icon-location"></i>
                <span slot="title">工具导航一</span>
            </el-menu-item>
          </router-link>
          <router-link to="/detail2" style="text-decoration: none;">
            <el-menu-item index="2">
              <i class="el-icon-menu"></i>
              <span slot="title">工具导航二</span>
            </el-menu-item>
          </router-link>
          <router-link to="/detail3" style="text-decoration: none;">
            <el-menu-item index="3">
              <i class="el-icon-document"></i>
              <span slot="title">工具导航三</span>
            </el-menu-item>
          </router-link>
          <router-link to="/detail4" style="text-decoration: none;">
            <el-menu-item index="4">
              <i class="el-icon-setting"></i>
              <span slot="title">工具导航四</span>
            </el-menu-item>
          </router-link>
        </el-menu>
      </el-col>
    </el-row>
  </div>
</template>

<script>
export default {
  methods: {
    handleOpen(key, keyPath) {
      console.log(key, keyPath);
    },
    handleClose(key, keyPath) {
      console.log(key, keyPath);
    },
  },
};
</script>

<style scoped>
.user-info {
  text-align: center;
  margin: 40px 0 20px 0; /* 上方40px，下方20px，左右都是0 */
}

.avatar {
  width: 80px;
  height: 80px;
  border-radius: 50%;
}

.username {
  margin-top: 30px; /* 上方10px */
  margin-bottom: 80px; /* 下方150px */
  font-size: 16px;
  color: #333;
}
</style>