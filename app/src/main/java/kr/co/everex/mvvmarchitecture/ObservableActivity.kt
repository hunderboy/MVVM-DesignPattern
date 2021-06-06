package kr.co.everex.mvvmarchitecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.databinding.DataBindingUtil
import kr.co.everex.mvvmarchitecture.databinding.ActivityObservableBinding
import kr.co.everex.mvvmarchitecture.observable.ObservableData

class ObservableActivity : AppCompatActivity() {
    private lateinit var binding: ActivityObservableBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_observable)

        setObserv()

    }

    fun setObserv(){
        var item = ObservableData()
        item.site = "Naver"
        binding.site = item

        Handler().postDelayed(Runnable {
            run {
                item.site = "Google"
            }
        },3000)
    }

}