```
```

# Activity Fragment 데이터 전달 방법

## 프래그먼트에서
```
프래그먼트에서
```

## 액티비티에서:
```
val myFragment = MyFragment newInstance "전달할 데이터"
supportFragmentManager beginTransaction
    replace R.id.fragment_container myFragment
    commit()

```

## 프래그먼트에서:
```
class MyFragment : Fragment
    var listener OnDataPass? = null
    interface OnDataPass 
        fun onDataPass data: String

    override fun onAttach context: Context
        super onAttach context
        listener = context as? OnDataPass
    fun passData
        listener?.onDataPass "전달할 데이터"
```

## 액티비티에서
```
class MainActivity : AppCompatActivity MyFragment OnDataPass
    override fun onCreate savedInstanceState: Bundle?
        super.onCreate savedInstanceState
        setContentView R.layout.activity_main)
        // 프래그먼트 추가 등의 작업을 수행

    override fun onDataPass(data: String) {
        // 여기에서 프래그먼트로부터 전달받은 데이터를 사용
```



```
done
```



# Fragment
```
// FirstFragment.kt
class FirstFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }
}

// SecondFragment.kt
class SecondFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }
}

```



# ViewPager2
```
dependencies {
    // ViewPager2
    implementation "androidx.viewpager2:viewpager2:1.0.0"

    // 만약 Fragment를 사용한다면
    implementation "androidx.fragment:fragment-ktx:1.3.6"
}

```



# ViewPager2와 FragmentStateAdapter 사용

```
// MyFragmentStateAdapter.kt
class MyFragmentStateAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 2 // 페이지 수

    override fun createFragment(position: Int): Fragment {
        // 페이지 위치에 따라 다른 Fragment 반환
        return when (position) {
            0 -> FirstFragment()
            else -> SecondFragment()
        }
    }
}

```

# ViewPager2 설정


```
<!-- activity_main.xml -->
<androidx.viewpager2.widget.ViewPager2
    android:id="@+id/viewPager"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />

```


```
// MainActivity.kt
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ViewPager2에 Adapter 설정
        val viewPager: ViewPager2 = findViewById(R.id.viewPager)
        viewPager.adapter = MyFragmentStateAdapter(this)
    }
}

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
