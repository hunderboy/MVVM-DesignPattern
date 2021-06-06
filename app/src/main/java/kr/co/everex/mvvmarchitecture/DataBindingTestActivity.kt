package kr.co.everex.mvvmarchitecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import kr.co.everex.mvvmarchitecture.databinding.ActivityDataBindingTestBinding

class DataBindingTestActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDataBindingTestBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_data_binding_test)
        binding.activity = this@DataBindingTestActivity

    }

    fun btnClick(view : View){
        Toast.makeText(this,"Button Click",Toast.LENGTH_SHORT).show()
    }

}