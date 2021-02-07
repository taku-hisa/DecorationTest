package com.example.decorationtest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.decorationtest.R
import com.example.decorationtest.databinding.FragmentBookmarkItemBinding

class bookmarkItem : Fragment() {
    private var _binding : FragmentBookmarkItemBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBookmarkItemBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy(){
        super.onDestroy()
        _binding = null
    }
}