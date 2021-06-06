package kr.co.everex.mvvmarchitecture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.everex.mvvmarchitecture.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val TAG: String = "MainActivity : "

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view) // 뷰 바인딩 적용 완료

        // 데이터 바인딩 테스트 화면으로 이동
        binding.button1.setOnClickListener(){
            val intent = Intent(this, DataBindingTestActivity::class.java)
            startActivity(intent)
        }
        // 리사이클러뷰 데이터 바인딩 테스트 화면으로 이동
        binding.button2.setOnClickListener(){
            val intent = Intent(this, RecyclerviewDataBindingActivity::class.java)
            startActivity(intent)
        }
        // 리사이클러뷰 데이터 바인딩 테스트 화면으로 이동
        binding.button3.setOnClickListener(){
            val intent = Intent(this, ObservableActivity::class.java)
            startActivity(intent)
        }

    }


}