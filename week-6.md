```
```

# Activity Fragment 데이터 전달 방법

## 프래그먼트에서
```
프래그먼트에서
```

## 액티비티에서:
```
val myFragment MyFragment newInstance "전달할 데이터"
supportFragmentManager beginTransaction
    replace Ridfragmentcontainer myFragment
    commit

```

## 프래그먼트에서:
```
class MyFragment Fragment
    var listener OnDataPass? null
    interface OnDataPass 
        fun onDataPass data String
    override fun onAttach context Context
        super onAttach context
        listener context as? OnDataPass
    fun passData
        listener? onDataPass "전달할 데이터"
```

## 액티비티에서
```
class MainActivity AppCompatActivity MyFragment OnDataPass
    override fun onCreate savedInstanceState: Bundle?
        super onCreate savedInstanceState
        setContentView Rlayoutactivitymain
        // 프래그먼트작업수행

    override fun onDataPass data: String
        // 프래그먼트전달받은데이터사용
```



```
donedonedonedonedonedonedonedonedonedonedonedonedonedonedonedonedonedonedonedonedonedonedonedonedone
```



# Fragment
```
// f.kt
class FirstFragment Fragment
    override fun onCreateView inflater: LayoutInflater, container ViewGroup?, savedInstanceState: Bundle? View?
        // Inflate the layout for this fragment
        return inflater inflate Rlayoutfragmentfirst, container, false

// s.kt
class SecondFragment Fragment
    override fun onCreateView inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?: View?
        // Inflate the layout for this fragment
        return inflater inflate Rlayoutfragmentsecond, container, false
```



# ViewPager2
```
dependencies 
    implementation androidx.viewpager2:viewpager2:1.0.0
    implementation androidx.fragment:fragment-ktx:1.3.6
```



# ViewPager2와 FragmentStateAdapter 사용

```
class MyFragmentStateAdapter fragmentActivity: FragmentActivity  : FragmentStateAdapter fragmentActivity
    override fun getItemCount: Int 2 // 페이지 수
    override fun createFragment position: Int : Fragment
        return when position
            0 -> FirstFragment
            else -> SecondFragment
```

# ViewPager2 설정


```
androidx.viewpager2.widget.ViewPager2
    android:id="@+id/viewPager"
```


```
class MainActivity : AppCompatActivity
    override fun onCreate savedInstanceState: Bundle?
        super onCreate savedInstanceState
        setContentView Rlayoutactivitymain
        // ViewPager2에 Adapter 설정
        val viewPager: ViewPager2 findViewById RidviewPager
        viewPager adapter MyFragmentStateAdapter this
```


```
```


```
```






### 

```
activity
android name = .SecondActivity
/activity
```


```
import Intent Bundle AppCompatActivity Button
class MainActivity AppCompatActivity
  override fun onCreate savedInstanceState Bundle?
  super onCreate savedInstanceState
  setContentView activity main
  val button Button findViewById R id button
  button setOnClickListener
  val intent Intent this SecondActivity::class java
  startActivity intent
```
