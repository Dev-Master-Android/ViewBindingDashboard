package com.example.viewbindingdashboard.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.viewbindingdashboard.databinding.FragmentWidgetBinding

class WidgetFragment : Fragment() {
    private lateinit var binding: FragmentWidgetBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWidgetBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.widget1.setOnClickListener {
            Toast.makeText(requireContext(), "Widget 1 Нажата", Toast.LENGTH_SHORT).show()
        }

        binding.widget2.setOnClickListener {
            Toast.makeText(requireContext(), "Widget 2 Нажата", Toast.LENGTH_SHORT).show()
        }

        binding.widget3.setOnClickListener {
            Toast.makeText(requireContext(), "Widget 3 Нажата", Toast.LENGTH_SHORT).show()
        }

        binding.widget4.setOnClickListener {
            Toast.makeText(requireContext(), "Widget 4 Нажата", Toast.LENGTH_SHORT).show()
        }
    }
}
