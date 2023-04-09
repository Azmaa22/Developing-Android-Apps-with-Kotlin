package com.example.aboutme
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding
    private  val myName:MyName = MyName("Asmaa Khaled",)
//   private lateinit var nicknameBtn:Button ;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    binding.myName = myName;
       // nicknameBtn = findViewById(R.id.nickName_btn)
        binding.nickNameBtn.setOnClickListener {
            getNickName()
        }
    }

    private  fun getNickName(){
       // val nicknameEditable:EditText = findViewById(R.id.nickname_edit)
        // val nicknameText:TextView=findViewById(R.id.nickName_text)
        if(binding.nicknameEdit.text.isEmpty()){
            Toast.makeText(this, "Please Enter Your Nick Name", Toast.LENGTH_LONG).show()
            }else{

                binding.apply {
                   myName?.nickname = binding.nicknameEdit.text.toString()
                    // Invalidate all binding expressions and request a new rebind to refresh UI
                    invalidateAll()
                           binding.nickNameText.visibility = View.VISIBLE
    binding.nickNameBtn.visibility = View.GONE
    binding.nicknameEdit.visibility = View.GONE

                }



        }

    }
}