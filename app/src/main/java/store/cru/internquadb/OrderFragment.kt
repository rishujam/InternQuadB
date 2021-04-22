package store.cru.internquadb

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import store.cru.internquadb.databinding.FragmentGoOutBinding
import store.cru.internquadb.databinding.FragmentOrderBinding

class OrderFragment : Fragment() {

    private var _binding: FragmentOrderBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOrderBinding.inflate(inflater, container,false)

        val list = mutableListOf<Food>()
        list.add(Food("Salad","Italian Veg"))
        list.add(Food("Dosa","Indian Veg"))
        list.add(Food("Burger","Chinese Veg"))
        list.add(Food("Pizza","Chinese Veg"))
        list.add(Food("Egg Roll","Indian Non-Veg"))
        list.add(Food("Chicken Roll","Indian Non-Veg"))
        list.add(Food("Paneer","Indian Veg"))
        list.add(Food("Hot Dog","Italian Veg"))
        list.add(Food("Sandwich","Chinese Non-Veg"))
        val adapter = AdapterFood(list)
        binding.rvFoodList.adapter = adapter
        binding.rvFoodList.layoutManager = LinearLayoutManager(context)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}