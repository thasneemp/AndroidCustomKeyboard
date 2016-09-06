package com.example.android.softkeyboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by muhammed on 9/6/2016.
 */
public class OutLineViewManager implements View.OnClickListener, CandidateView.OnCharacterChangeListener {
    private ViewGroup view;
    private Context context;
    private Button mSendButton;
    private Button mRecieveButton;
    private ViewGroup inflate;
    private EditText mEditText;

    public OutLineViewManager(Context context, ViewGroup view) {

        this.view = view;
        this.context = context;
        init();
    }


    public OutLineViewManager(Context context, AttributeSet attrs) {
        init();
    }

    public OutLineViewManager(Context context, AttributeSet attrs, int defStyleAttr) {
        init();
    }


    private void init() {
        mRecieveButton = (Button) view.findViewById(R.id.receiveButton);
        mSendButton = (Button) view.findViewById(R.id.sendButton);
        mEditText = (EditText) view.findViewById(R.id.editText);
        mSendButton.setOnClickListener(this);
        mRecieveButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sendButton:
                Toast.makeText(getContext(), "Send Button Pressed", Toast.LENGTH_SHORT).show();
                break;
            default:
                mRecieveButton.setEnabled(true);
                Toast.makeText(getContext(), "Receive Button Pressed", Toast.LENGTH_SHORT).show();
                break;

        }
    }

    public Context getContext() {
        return context;
    }

    @Override
    public void onCharacterChanged(String letter) {
        mEditText.setText(letter);
    }

    public void setText(CharSequence text) {

    }
}
