package com.example.jet_nav_databinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.setFragmentResultListener
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController import com.example.jet_nav_databinding.databinding.FragmentSecondBinding
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    private val viewmodel : MainViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentSecondBinding>(inflater,R.layout.fragment_second,container,false)
        binding.lifecycleOwner = this
        binding.vm = viewmodel
        setFragmentResultListener("requestKey"){requestKey, bundle ->
            val cnt = bundle.getString("cnt","")
            binding.vm?.count=cnt.toInt()
            count_txt.text = cnt
        }



        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        btn_pre.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment2_to_firstFragment2)

        }
    }


    }
