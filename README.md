# LotteryPlate
-
###这个转盘效果在项目的实际使用的基础上扩展而来.现在将它开源出来,方便小伙伴们使用.
####特点:
1.稳定.目前经过了真实项目 [镭达钱包](http://sj.qq.com/myapp/detail.htm?apkName=com.igeek.radarwallet) 中4天6000+的点抽奖实践,未发现bug;  
2.支持多种属性,配置成多个item的抽奖转盘.属性请参考文后.

####效果图:
![](https://github.com/hjmJhon/LotteryPlate/raw/master/ScreenShots/001.png)
![](https://github.com/hjmJhon/LotteryPlate/raw/master/ScreenShots/002.png)
![](https://github.com/hjmJhon/LotteryPlate/raw/master/ScreenShots/003.png)
![](https://github.com/hjmJhon/LotteryPlate/raw/master/ScreenShots/004.png)
![](https://github.com/hjmJhon/LotteryPlate/raw/master/ScreenShots/01.gif)
![](https://github.com/hjmJhon/LotteryPlate/raw/master/ScreenShots/02.gif)
![](https://github.com/hjmJhon/LotteryPlate/raw/master/ScreenShots/03.gif)
![](https://github.com/hjmJhon/LotteryPlate/raw/master/ScreenShots/04.gif)  

####使用:直接把lib拷进你的project
in your layout

```
<com.example.hjm.lotteryplate.LotteryDisk
        android:id="@+id/activity_lotteryplate_rotatePan"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:background="@color/colorAccent"
        android:padding="30dp"
        android:visibility="visible"
        app:textColor="@color/colorAccent"
        app:textSize="11sp"
        app:eventArcBgColor="@android:color/darker_gray"
        app:oneCircleDuration="500"
        app:minTurnsNum="10"
        app:maxTurnsNum="14"
        app:itemCount="six"/>
       
```
####属性:
|       attribute       |       meaning          |
| :-------------------- | :--------------------- |
|  textColor            |   文字颜色              |
|  textSize            |    文字大小              |
| eventArcBgColor       |   偶数弧形的背景色        |
| oneCircleDuration     |   奇数弧形的背景色        |
|  minTurnsNum          |    最少转几圈           |
|  maxTurnsNum          |    最多转几圈(实际转的圈数是最值之间的随机数)|
|   itemCount         |     弧形的个数,只有4种: 6,8,10,12 |

###该抽奖转盘参考了[Nipuream LuckPan](https://github.com/Nipuream/LuckPan),他的实现思路给了我很大启发,感谢!

###使用过程中有任何问题,可以随时联系我 hjm0908hjm@163.com,欢迎 pr!



