package com.example.cryptoapp.ui


import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.cryptoapp.base.BaseFragment
import com.example.cryptoapp.databinding.FragmentHomeBinding


class HomeFragment : BaseFragment<FragmentHomeBinding,HomeViewModel>(
    FragmentHomeBinding::inflate
) {
    override val viewModel by viewModels<HomeViewModel>()
        

    override fun onCreatedFinished() {
        TODO("Not yet implemented")
    }

    override fun initializeListener() {
        TODO("Not yet implemented")
    }

    override fun observeEvents() {
        TODO("Not yet implemented")
    }


}