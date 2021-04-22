package store.cru.internquadb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import store.cru.internquadb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val orderFragment = OrderFragment()
        val goOutFragment = GoOutFragment()
        val proFragment = ProFragment()
        val nutritionFragment = NutritionFragment()
        val donateFragment = DonateFragment()

        setCurrentFragment(orderFragment)

        binding.bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.miOrder -> setCurrentFragment(orderFragment)
                R.id.miGoOut -> setCurrentFragment(goOutFragment)
                R.id.miPro -> setCurrentFragment(proFragment)
                R.id.miNutrition -> setCurrentFragment(nutritionFragment)
                R.id.miDonate -> setCurrentFragment(donateFragment)
            }
            true
        }
    }

    private fun setCurrentFragment(frag:Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,frag)
            commit()
        }
    }
}