package kr.co.everex.mvvmarchitecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import kr.co.everex.mvvmarchitecture.databinding.ActivityDataBindingTestBinding
import kr.co.everex.mvvmarchitecture.databinding.ActivityRecyclerviewDataBindingBinding
import kr.co.everex.mvvmarchitecture.dataclass.ProfileData
import kr.co.everex.mvvmarchitecture.recyclerviewadapter.ProfileAdapter

class RecyclerviewDataBindingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerviewDataBindingBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_recyclerview_data_binding)
        binding.activity = this@RecyclerviewDataBindingActivity

        setRcv()

    }


    fun btnClick(view : View){
        Toast.makeText(this,"Button Click",Toast.LENGTH_SHORT).show()
    }

    fun setRcv() {
        val profileAdapter = ProfileAdapter(this)
        binding.mainRcv.layoutManager = LinearLayoutManager(this)
        binding.mainRcv.adapter = profileAdapter
        profileAdapter.data = listOf(
            ProfileData(name = "Kang", age = 26),
            ProfileData(name = "Kim", age = 25)
        )
        profileAdapter.notifyDataSetChanged()
    }
}