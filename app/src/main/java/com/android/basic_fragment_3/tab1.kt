package com.android.basic_fragment_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.basic_fragment_3.databinding.FragmentTab1Binding

class tab1 : Fragment() {
    private var _binding: FragmentTab1Binding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?, ): View? {
        _binding = FragmentTab1Binding.inflate(inflater, container, false)
        return binding.root
    }
}