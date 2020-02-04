- 参考： https://www.jianshu.com/p/6ec6b06cb5d6

### 三种方式
1、直接在module的build.gradle中开发
2、创建当前项目使用的插件
3、创建通用的插件，发布到maven

#### 直接在module的build.gradle中开发


#### 创建当前项目使用的插件
- 注意：名字为buildsrc,注意这个名字只能为buildsrc，如果不是这个名称，这里是无法apply包名的，会提示找不到

#### 创建通用的插件，发布到maven