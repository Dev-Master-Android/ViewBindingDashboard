package com.example.viewbindingdashboard.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.viewbindingdashboard.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {
    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Пример установки данных в поля при создании фрагмента
        binding.profileName.setText("Дима Иванов")
        binding.profileEmail.setText("john.doe@example.com")

        binding.saveProfileButton.setOnClickListener {
            val name = binding.profileName.text.toString()
            val email = binding.profileEmail.text.toString()

            if (name.isNotEmpty() && email.isNotEmpty()) {
                // Логика сохранения профиля, например, в SharedPreferences или базе данных
                saveProfile(name, email)
                Toast.makeText(requireContext(), "Профиль сохранен", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(requireContext(), "Заполните поле", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun saveProfile(name: String, email: String) {
        // Здесь можно реализовать сохранение данных в SharedPreferences, базе данных и т.д.
        val sharedPreferences = requireActivity().getSharedPreferences("ProfileData", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString("NAME", name)
        editor.putString("EMAIL", email)
        editor.apply()
    }
}
