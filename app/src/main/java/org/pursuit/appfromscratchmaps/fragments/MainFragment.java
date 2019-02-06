package org.pursuit.appfromscratchmaps.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.pursuit.appfromscratchmaps.R;
import org.pursuit.appfromscratchmaps.models.MuseumWrapper;
import org.pursuit.appfromscratchmaps.network.MuseumService;
import org.pursuit.appfromscratchmaps.network.RetrofitSingleton;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainFragment extends Fragment {
    private static final String TAG = "MainFragment";
    private View rootView;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    public static MainFragment newInstance (){
        return new MainFragment();
    }


    public MainFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MainFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MainFragment newInstance(String param1, String param2) {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_main, container, false);
        Retrofit retrofit = RetrofitSingleton.getInstance();
        MuseumService museumService = retrofit.create(MuseumService.class);
        Call<MuseumWrapper>museumWrapperCall = museumService.getMuseums();
        museumWrapperCall.enqueue(new Callback<MuseumWrapper>() {
            @Override
            public void onResponse(Call<MuseumWrapper> call, Response<MuseumWrapper> response) {
                Log.d("Luis was here", "onResponse" + response.body().getMuseums().get(0).getName());
            }

            @Override
            public void onFailure(Call<MuseumWrapper> call, Throwable t) {

            }
        });
        return rootView;
    }

}
