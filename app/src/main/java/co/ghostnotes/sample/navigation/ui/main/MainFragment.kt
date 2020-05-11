package co.ghostnotes.sample.navigation.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment.findNavController
import co.ghostnotes.sample.navigation.R
import co.ghostnotes.sample.navigation.databinding.FragmentMainBinding
import timber.log.Timber

class MainFragment : Fragment() {

    companion object {

        fun newInstance() : MainFragment = MainFragment()

    }

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_main, container, false)
        binding.lifecycleOwner = requireActivity()

        binding.text.setOnClickListener { view ->
            Timber.d("### text!")
            val action = MainFragmentDirections.actionMainFragmentToBlankFragment()
            findNavController(this).navigate(action)
        }

        return binding.root
    }

}