package com.levnovikov.postbus.root.home.prebooking.car_type_selector.car_type_list.di;

import com.levnovikov.postbus.root.home.prebooking.car_type_selector.car_type_list.CarTypeListBuilder;
import com.levnovikov.postbus.root.home.prebooking.car_type_selector.car_type_list.CarTypeListView;
import com.levnovikov.postbus.root.home.prebooking.car_type_selector.di.CarTypeSelectorComponent;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

/**
 * Created by lev.novikov
 * Date: 25/12/17.
 */

@CarTypeListScope
@Component(dependencies = CarTypeSelectorComponent.class, modules = CarTypeListComponent.CarTypeListModule.class)
public interface CarTypeListComponent {

    void inject(CarTypeListView view);

    void inject(CarTypeListBuilder carTypeListBuilder);

    @Module
    class CarTypeListModule {

        private CarTypeListView view;

        public CarTypeListModule(CarTypeListView view) {
            this.view = view;
        }

        @CarTypeListScope
        @Provides
        CarTypeListView provideView() {
            return view;
        }
    }
}