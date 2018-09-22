package com.example.android.sunshine.ui.list;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;

import com.example.android.sunshine.data.SunshineRepository;

public class MainActivityViewModelFactory extends ViewModelProvider.NewInstanceFactory {
    private SunshineRepository mResponRepository;
    public MainActivityViewModelFactory(SunshineRepository repository){
        this.mResponRepository = repository;
    }

    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        return (T) new MainActivityViewModel(mResponRepository);
    }
}
