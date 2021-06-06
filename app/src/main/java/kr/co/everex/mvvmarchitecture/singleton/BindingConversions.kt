package kr.co.everex.mvvmarchitecture.singleton

import android.util.Log
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import kr.co.everex.mvvmarchitecture.R


object BindingConversions {

    /**
    BindingConversions 라는 이름의 파일을 하나 만들고 거기에 BindingAdapter를 생성하였다.
    BindingAdpater를 쓸 때 주의할 점은 메모리 상에 올리고 사용하기 때문에 Static으로 만들어 사용해야하며,
    Kotlin에서는 자바와 다른게 class가 아닌 Object로 설정해야한다.
    "@JvmStatic"은 Static 함수로 설정해주기 위한 Annotation이다.
     */
    @BindingAdapter("imageUrl")
    @JvmStatic
    /**
     * @param imageView : ImageView
     * @param url : String
    함수에 들어오는 파라미터는 View와 바인딩시켜준 값이다.
    여기서 "url : String"은 xml에서 설정해준 "user.profile"이 될 것이다.
    함수 내부를 살펴보면 Glide를 이용해서 프로필 사진이 들어갈 이미지뷰에 그림을 넣어주고 있다.
    error 부분은 Glide에서 load()에 문제가 있을 경우 대신 들어갈 이미지를 의미한다. 직접 저렇게 넣어줘도 되지만,
    xml코드에서 BindingAdapter를 이용해 사용해도 될 것이다.
     */
    fun loadImage(imageView : ImageView, url : String){
        Log.e("url ", url)

        Glide.with(imageView.context)
            .load(url)
            .error(R.drawable.star)
            .into(imageView)

        // ImageView & Image data 를 묶는다 .
//        Glide.with(App.getApplicationContext())
//            .load(exerciseModel.exerciseImage)
//            .error(R.mipmap.ic_launcher)
//            .placeholder(R.mipmap.ic_launcher)
//            .into(exerciseImageView)

    }

}