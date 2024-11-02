package com.example.viewbindingdashboard.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.viewbindingdashboard.R
import com.example.viewbindingdashboard.databinding.FragmentLogoutBinding

class LogoutFragment : Fragment() {
    private lateinit var binding: FragmentLogoutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLogoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.confirmLogoutButton.setOnClickListener {
            // Реализовать логику выхода из системы
            Toast.makeText(requireContext(), "Вышли из приложения", Toast.LENGTH_SHORT).show()
            requireActivity().finishAffinity()
            // Можно добавить переход на экран входа
        }

        binding.cancelLogoutButton.setOnClickListener {
            // Возврат на предыдущий экран
        binding.cancelLogoutButton.setOnClickListener {
            // Возврат на предыдущий экран
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, MainFragment())
                .commit()
        }
        }
    }
}
