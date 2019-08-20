package com.example.working_focus.Home;

import com.example.working_focus.R;

import java.util.ArrayList;

public class HomePresenterImpl implements HomeContract.Presenter {
    private final HomeContract.View mHomeContractView;

    public HomePresenterImpl(HomeContract.View homeContractView) {
        mHomeContractView = homeContractView;
        mHomeContractView.setPresenter(this);
    }


    public ArrayList<SoundListItem> getSoundList() {
        ArrayList<SoundListItem> temp = new ArrayList<>();
        temp.add(new SoundListItem(R.drawable.ic_sound_acoustic_guitar, "Acoustic Guitar"));
        temp.add(new SoundListItem(R.drawable.ic_sound_beach_waves, "Beach Waves"));
        temp.add(new SoundListItem(R.drawable.ic_sound_bonfire, "Bonfire"));
        temp.add(new SoundListItem(R.drawable.ic_sound_drizzle, "Drizzle"));
        temp.add(new SoundListItem(R.drawable.ic_sound_forest, "Forest"));
        temp.add(new SoundListItem(R.drawable.ic_sound_stream, "Stream"));
        temp.add(new SoundListItem(R.drawable.ic_sound_summer_night, "Summer Night"));

        return temp;
    };


}
