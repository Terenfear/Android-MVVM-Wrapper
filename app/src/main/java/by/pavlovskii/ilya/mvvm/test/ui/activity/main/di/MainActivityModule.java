package by.pavlovskii.ilya.mvvm.test.ui.activity.main.di;

import android.support.annotation.NonNull;
import android.util.Log;

import by.mvvmwrapper.dagger.scope.ActivityScope;
import by.pavlovskii.ilya.mvvm.test.navigator.MainNavigator;
import by.pavlovskii.ilya.mvvm.test.ui.activity.main.MainViewData;
import by.pavlovskii.ilya.mvvm.test.ui.activity.main.MainViewModel;
import by.pavlovskii.ilya.mvvm.test.utils.DemoActivityFactory;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import ru.terrakok.cicerone.Navigator;

/**
 * Create with Android Studio<br>
 * Created by Pavlovskii Ilya<br>
 * E-mail: pavlovskii_ilya@mail.ru, trane91666@gmail.com<br>
 * Skype: trane9119<br>
 * Date: 08.12.2017<br>
 * Time: 16:18<br>
 * Project name: MVVMtest<br>
 * ===================================================================================<br>
 */
@Module
@ActivityScope
public abstract class MainActivityModule {

    @Binds
    @ActivityScope
    abstract Navigator navigator(MainNavigator navigator);

    @Provides
    @ActivityScope
    static MainViewData viewData() {
        return new MainViewData();
    }

    @Provides
    @ActivityScope
    static MainViewModel viewModel(@NonNull MainViewData viewData, @NonNull DemoActivityFactory demoActivityFactory) {
        Log.d("MainViewModel", "provide");
        return new MainViewModel(viewData, demoActivityFactory);
    }

}
