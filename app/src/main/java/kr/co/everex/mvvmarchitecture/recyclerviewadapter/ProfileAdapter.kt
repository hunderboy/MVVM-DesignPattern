package kr.co.everex.mvvmarchitecture.recyclerviewadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kr.co.everex.mvvmarchitecture.databinding.RcvListItemBinding
import kr.co.everex.mvvmarchitecture.dataclass.ProfileData



class ProfileAdapter (private val context : Context) : RecyclerView.Adapter<ProfileAdapter.ProfileVH>() {

    var data = listOf<ProfileData>()

    /**
     * 데이터 바인딩을 사용하면 뷰 홀더에 View를 보내주는 것이 아닌 바인딩 클래스를 보내줘야 하므로 코드도 그에 맞춰 바뀌게 된다.
     * 데이터 바인딩을 사용한 어댑터의 코드 전문을 보면서 천천히 살펴보자.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileVH {
        val binding = RcvListItemBinding.inflate(
            LayoutInflater.from(context), parent, false
        )
        return ProfileVH(binding)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ProfileVH, position: Int) {
        holder.onBind(data[position])
    }

    class ProfileVH(val binding: RcvListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(data: ProfileData) {
            binding.user = data
        }


    }
}