```
```



### gradle
```
compileSdk = 34
targetSdk = 34
implementation("androidx.fragment:fragment-ktx:1.6.2")


```


### LoginActivity
```
import R Intent Bundle Log Button AppCompatActivity TextInputEditText

class LoginActivity AppCompatActivity
private lateinit var idInput: TextInputEditText pwInput: TextInputEditText loginButton: Button
setContentView(com.daelim.R.layout.activity_login)
        idInput = findViewById(com.daelim.R.id.idInput)
        pwInput = findViewById(com.daelim.R.id.pwInput)
        loginButton = findViewById(com.daelim.R.id.loginButton)

        loginButton.setOnClickListener {
            login()
    private fun login() {
        val id = idInput.text.toString()
        val pw = pwInput.text.toString()

        if (pw == "1234")
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("userId", id)
            startActivity(intent)
        } else {
            Log.d("LoginActivity", "1234입력")
```

### MainActivity
```
import AppCompatActivity Bundle Button TextView Fragment
class MainActivity : AppCompatActivity() {
    private lateinit var homeBtn: TextView homeName: TextView btn1: Button btn2: Button

    override fun onCreate savedInstanceState: Bundle?
        super onCreate savedInstanceState 
        setContentView activity_main

        homeName = findViewById home_name
        val userId = intent getStringExtra "userId"

        homeName text = userId
        homeBtn = findViewById(R.id.home_btn)

        btn1 = findViewById(R.id.button)
        btn2 = findViewById(R.id.button2)

        btn1.setOnClickListener 
            replaceFragment(HomeFragment())
        
        btn2.setOnClickListener 
            replaceFragment(MyFragment())



    fun setButtonText text: String
        homeBtn text = text
    private fun replaceFragment fragment: Fragment
        supportFragmentManager beginTransaction apply
            replace fragmentContainerView, fragment
            commit()

```

### 
```
import Bundle Fragment LayoutInflater View ViewGroup Button

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.home_bt1).setOnClickListener {
            buttonClicked(it)
        }
        view.findViewById<Button>(R.id.home_bt2).setOnClickListener {
            buttonClicked(it)
        }
        view.findViewById<Button>(R.id.home_bt3).setOnClickListener {
            buttonClicked(it)
        }
    }


    private fun buttonClicked(view: View) {
        if (view is Button) {
            (activity as? MainActivity)?.setButtonText(view.text.toString())
        }
    }
}

```

### 
```
import Bundle Fragment LayoutInflater View ViewGroup Button R

class MyFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.my_btn1).setOnClickListener {
            buttonClicked(it)
        }
        view.findViewById<Button>(R.id.home_bt2).setOnClickListener {
            buttonClicked(it)
        }
    }

    private fun buttonClicked(view: View) {
        if (view is Button) {
            (activity as? MainActivity)?.setButtonText(view.text.toString())
        }
    }
}

```

### 
```

```

### 
```

```

### 
```

```

### 
```

```

### 
```

```

### 
```

```

### 
```

```

### 
```

```

