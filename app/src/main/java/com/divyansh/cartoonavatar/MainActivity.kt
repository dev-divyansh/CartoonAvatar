package com.divyansh.cartoonavatar

import android.R
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.divyansh.cartoonavatar.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val pic_id = 123

    override fun onCreate(savedInstanceState: Bundle?) {
        var top : String = "ShortHairShortCurly"
         var beard : String = "Blank"
         var assec : String = "Blank"
         var face : String = "Smile"

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.webpg.loadUrl("https://avataaars.io/")

        // this is for the top
        val options1 = arrayOf("ShortHairShaggyMullet", "LongHairBigHair", "Hat", "ShortHairShortCurly")
        val arrayAdapter = ArrayAdapter(this , android.R.layout.simple_spinner_dropdown_item , options1)

        // this  is for assecories

        val options2 = arrayOf("Kurt","Round","Sunglasses","Wayfarers")
        val array2Adapter = ArrayAdapter(this , android.R.layout.simple_spinner_dropdown_item , options2)

        // this is for beard

        val options3 = arrayOf("BeardMedium","MoustacheMagnum","MoustacheFancy","BeardMajestic","BeardLight")
        val arrayAdapter3 = ArrayAdapter(this , android.R.layout.simple_spinner_dropdown_item , options3)

        // this is for facial expression
        val options4 = arrayOf("Smile","Serious","Eating","ScreamOpen")
        val arrayadapter4 = ArrayAdapter(this , android.R.layout.simple_spinner_dropdown_item , options4)





        // SETTING UP ADAPTERS
        binding.spinner.adapter = arrayAdapter
        binding.spinner2.adapter = array2Adapter
        binding.spinner4.adapter = arrayAdapter3
        binding.spinner5.adapter = arrayadapter4




        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                top  = options1[p2].toString()
                binding.webpg.loadUrl("https://avataaars.io/?avatarStyle=Circle&topType=${top}&accessoriesType=${assec}&facialHairType=${beard}&mouthType=${face}")
                // binding.webpg.loadUrl("https://avataaars.io/?avatarStyle=Circle&accessoriesType=Blank&facialHairType=BeardLight&mouthType=ScreamOpen&topType=${options1[p2].toString()}")

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                //  when nothing is  selected by the user
            }

        }

        binding.spinner2.onItemSelectedListener = object  : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                assec = options2[p2].toString()
                binding.webpg.loadUrl("https://avataaars.io/?avatarStyle=Circle&topType=${top}&accessoriesType=${assec}&facialHairType=${beard}&mouthType=${face}")
                // binding.webpg.loadUrl("https://avataaars.io/?avatarStyle=Circle&topType=Hat&facialHairType=BeardLight&mouthType=ScreamOpen&accessoriesType=${options1[p2].toString()}")
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                //  in case no item is  selected we dont  do anything
            }

        }

        binding.spinner4.onItemSelectedListener = object  : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                beard = options3[p2].toString()
                binding.webpg.loadUrl("https://avataaars.io/?avatarStyle=Circle&topType=${top}&accessoriesType=${assec}&facialHairType=${beard}&mouthType=${face}")
               // binding.webpg.loadUrl("https://avataaars.io/?avatarStyle=Circle&topType=Hat&accessoriesType=Kurt&mouthType=ScreamOpen&facialHairType=${options1[p2].toString()}")
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                //  in case no item is  selected we dont  do anything
            }

        }

        binding.spinner5.onItemSelectedListener = object  : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                face = options4[p2].toString()
                binding.webpg.loadUrl("https://avataaars.io/?avatarStyle=Circle&topType=${top}&accessoriesType=${assec}&facialHairType=${beard}&mouthType=${face}")
               // binding.webpg.loadUrl("https://avataaars.io/?avatarStyle=Circle&topType=Hat&accessoriesType=Kurt&facialHairType=BeardLight&mouthType=${options1[p2].toString()}")
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                //  in case no item is  selected we dont  do anything
            }

        }
    }


}