package com.lubitelsoft.shrekcast.ui.enter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lubitelsoft.shrekcast.R
import com.lubitelsoft.shrekcast.databinding.FragmentEnterBinding
import com.lubitelsoft.shrekcast.databinding.FragmentOnBoardingBinding


class EnterFragment : Fragment() {

    private lateinit var viewBinding: FragmentEnterBinding

    var isPolicyChecked = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentEnterBinding.inflate(inflater, container, false)
        val view = viewBinding.root
        viewBinding.policyCheckBox.setOnCheckedChangeListener { compoundButton, isChecked ->
            isPolicyChecked = isChecked
        }
        return view
    }
}