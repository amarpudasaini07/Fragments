package Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdFragment extends Fragment implements View.OnClickListener{

    private EditText etNum;
    private Button btnoddeven;


    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_third, container, false);

        etNum=view.findViewById(R.id.etNum);
        btnoddeven=view.findViewById(R.id.btnoddeven);

        btnoddeven.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        int num=Integer.parseInt(etNum.getText().toString());
    }
}
