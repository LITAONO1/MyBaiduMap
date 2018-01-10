> 一般APP里常用的也就是地图、overlay轨迹、定位。这三部分都做成了fragment。随便建个Activity传入数据，承载这个fragment显示就行了。不再需要按百度地图文档一步步那么麻烦，还容易出错。

- 已集成的部分：

    - 地图显示，地图的点击、缩放、滑动
    - overlay： marker、line的绘制及点击弹出信息提示框【显示经纬度，地理信息】（百度地图demo所说的泡泡）
    - 定位：LocationClient做成了util单例，简化locationClient配置使用及监听坐标接口的步骤
    - 路线规划：RoutePlanSearch路线搜索做成了util，可在任何地方更方便集成路线规划功能，只需传入context和baidumap对象
    - 导航

