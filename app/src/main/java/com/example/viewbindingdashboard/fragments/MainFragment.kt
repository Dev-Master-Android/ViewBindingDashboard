package com.example.viewbindingdashboard.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import com.example.viewbindingdashboard.R
import com.example.viewbindingdashboard.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    
    private lateinit var binding: FragmentMainBinding
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }
    
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.cardProfile.setOnClickListener {
            // Скрыть главный макет и показать ProfileFragment
            binding.linearLayot.visibility = View.GONE
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, ProfileFragment())
                .addToBackStack(null)
                .commit()
        }
        binding.cardChat.setOnClickListener {
            // Скрыть главный макет и показать ChatFragment
            binding.linearLayot.visibility = View.GONE
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, ChatFragment())
                .addToBackStack(null)
                .commit()
        }
        binding.cardHome.setOnClickListener {
            // Скрыть главный макет и показать HomeFragment
            binding.linearLayot.visibility = View.GONE
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HomeFragment())
                .addToBackStack(null)
                .commit()
        }
        binding.cardWidget.setOnClickListener {
            // Скрыть главный макет и показать WidgetFragment
            binding.linearLayot.visibility = View.GONE
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, WidgetFragment())
                .addToBackStack(null)
                .commit()
        }
        binding.cardSetting.setOnClickListener {
            // Скрыть главный макет и показать SettingFragment
            binding.linearLayot.visibility = View.GONE
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, SettingFragment())
                .addToBackStack(null)
                .commit()
        }
        binding.cardLogout.setOnClickListener {
            // Скрыть главный макет и показать LogoutFragment
            binding.linearLayot.visibility = View.GONE
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, LogoutFragment())
                .addToBackStack(null)
                .commit()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            if (requireActivity().supportFragmentManager.backStackEntryCount > 0) {
                requireActivity().supportFragmentManager.popBackStack()
                binding.linearLayot.visibility = View.VISIBLE
            } else {
                requireActivity().onBackPressed()
            }
            return true
        }
        return super.onOptionsItemSelected(item)
    }

}