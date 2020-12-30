package com.example.jet_nav_databinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.jet_nav_databinding.databinding.FragmentFirstBinding
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {

    private val viewmodel : MainViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentFirstBinding>(inflater,R.layout.fragment_first,container,false)

        binding.lifecycleOwner = this
        binding.vm = viewmodel

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_next.setOnClickListener {
           setFragmentResult("requestKey", bundleOf("cnt" to count_txt.text))
            findNavController().navigate(R.id.action_firstFragment2_to_secondFragment2)
        }
    }


}