package co.ghostnotes.sample.navigation.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import co.ghostnotes.sample.navigation.R
import co.ghostnotes.sample.navigation.databinding.FragmentMainBinding

class SecondFragment : Fragment() {

    companion object {

        fun newInstance(): SecondFragment = SecondFragment()
    }

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_second, container, false)
        binding.lifecycleOwner = requireActivity()

        return binding.root
    }

}