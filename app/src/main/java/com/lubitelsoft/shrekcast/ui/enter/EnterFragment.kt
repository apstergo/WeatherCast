package com.lubitelsoft.shrekcast.ui.enter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doOnTextChanged
import com.lubitelsoft.shrekcast.R
import com.lubitelsoft.shrekcast.core.extensions.spanString
import com.lubitelsoft.shrekcast.databinding.FragmentEnterBinding



class EnterFragment : Fragment() {

    private lateinit var viewBinding: FragmentEnterBinding

    private var isPolicyChecked = false
    private var isEtNotEmpty = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentEnterBinding.inflate(inflater, container, false)
        val view = viewBinding.root

        viewBinding.nameET.doOnTextChanged { text, start, before, count ->
            isEtNotEmpty = viewBinding.nameET.text.isNotEmpty()
            checkBtnEnable()
        }

        viewBinding.policyCheckBox.setOnCheckedChangeListener { compoundButton, isChecked ->
            isPolicyChecked = isChecked
            checkBtnEnable()
        }

        viewBinding.policyText.apply {
            this.text = text.spanString(
                startIndex = 11,
                endIndex = 32,
                color = requireContext().getColor(R.color.green)
            ).spanString(
                startIndex = 33,
                endIndex = 45,
                color = requireContext().getColor(R.color.stroike_gray)
            )
        }
        return view
    }

    private fun checkBtnEnable() {
        viewBinding.btnContinue.isEnabled = isPolicyChecked && isEtNotEmpty
    }
}