package com.daelim

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import java.util.zip.Inflater

class MyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.my_btn1).setOnClickListener { btnclicked(it) }
        view.findViewById<Button>(R.id.my_btn2).setOnClickListener { btnclicked(it) }
    }

    private fun btnclicked(view: View) {
        if (view is Button) {
            (activity as? MainActivity)?.setButtonName(view.text.toString())
        }
    }
}
