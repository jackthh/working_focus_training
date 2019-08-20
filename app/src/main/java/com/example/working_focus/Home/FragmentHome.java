package com.example.working_focus.Home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.working_focus.R;

import java.util.ArrayList;

public class FragmentHome extends Fragment implements HomeContract.View, View.OnClickListener {
    private HomeContract.Presenter mPresenter;
    ImageView mTogglePlay;
    ImageView mToggleRefresh;
    ImageView mToggleMute;
    RecyclerView mRecyclerSoundList;
    SoundListAdapter mSoundListAdapter;

    public static FragmentHome newInstance() {
        return new FragmentHome();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View tempFragment = inflater.inflate(R.layout.fragment_home, container, false);

        mTogglePlay = tempFragment.findViewById(R.id.image_play_pause);
        mTogglePlay.setOnClickListener(this);
        mToggleRefresh = tempFragment.findViewById(R.id.image_refresh);
        mToggleRefresh.setOnClickListener(this);
        mToggleMute = tempFragment.findViewById(R.id.image_mute);
        mToggleMute.setOnClickListener(this);

        mRecyclerSoundList = tempFragment.findViewById(R.id.recycler_sound_list);
        mRecyclerSoundList.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        initSoundList(mPresenter.getSoundList());
        mRecyclerSoundList.setAdapter(mSoundListAdapter);



        /*End of onCreate*/
        return tempFragment;
    }

    @Override
    public void setPresenter(HomeContract.Presenter presenter) {
        mPresenter = presenter;

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.image_play_pause: {
                if (mTogglePlay.isActivated()) {

                } else {

                }
            }
            case R.id.image_refresh: {

            }
            case R.id.image_mute: {

            }
        }

    }

    public void initSoundList(ArrayList<SoundListItem> listItems) {
        mSoundListAdapter = new SoundListAdapter(getActivity(), listItems);
        mSoundListAdapter.notifyDataSetChanged();
    }
}
