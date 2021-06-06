package kr.co.everex.mvvmarchitecture.viewholder

import androidx.recyclerview.widget.RecyclerView
import kr.co.everex.mvvmarchitecture.databinding.RcvListItemBinding
import kr.co.everex.mvvmarchitecture.dataclass.ProfileData


/**
     굉장히 코드가 짧아진다. RcvListItemBinding은 파스칼 표기법으로 바뀐 rcv_list_item.xml의 클래스다.
     user라는 변수에 어댑터를 통해 전달돼 온 ProfileData를 넣어준다. 그리고 View타입을 받는 것이 아니라
     바인딩된 클래스를 받는 것도 하나의 차이점이다.
 */
class ProfileVH(val binding : RcvListItemBinding) : RecyclerView.ViewHolder(binding.root){

    fun onBind(data : ProfileData){
        binding.user = data
    }

}