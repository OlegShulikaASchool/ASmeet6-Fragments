package ru.olegshulika.asmeet6_fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment3_TextView extends Fragment {
    private static final String TAG = "Fragment3_TextView";
    private static final String ARG_PARAM1 = "Fragment3_TextView_param1";

    private String mParam1="?";
    private TextView mTextView;

    public void setTextViewValue(String text) { if (mTextView!=null) mTextView.setText(text);}
    public void appendTextViewValue(String text) { if (mTextView!=null) mTextView.append(" "+text);}


    public Fragment3_TextView() {
        // Required empty public constructor
    }

    public static Fragment3_TextView newInstance(String param1) {
        Fragment3_TextView fragment = new Fragment3_TextView();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, " onCreate");
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, " onCreateView");
        mTextView = new TextView(getActivity());
        mTextView.setBackgroundColor(getResources().getColor(R.color.colorF3));
        mTextView.setVerticalScrollBarEnabled(true);
        setTextViewValue(mParam1);

        return mTextView;
    }

}
