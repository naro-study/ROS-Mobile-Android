package com.schneewittchen.rosandroid.widgets.camera;

import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;

import com.schneewittchen.rosandroid.R;
import com.schneewittchen.rosandroid.ui.fragments.details.WidgetChangeListener;
import com.schneewittchen.rosandroid.ui.views.BaseDetailSubscriberVH;

import java.util.Arrays;


/**
 * TODO: Description
 *
 * @author Nils Rottmann
 * @version 1.0.0
 * @created on 13.05.20
 * @updated on 07.09.20
 * @modified by Nico Studt
 * @updated on 17.09.20
 * @modified by Nils Rottmann
 */
public class CameraDetailVH extends BaseDetailSubscriberVH<CameraEntity> {

    public static final String TAG = CameraDetailVH.class.getSimpleName();


    public CameraDetailVH(@NonNull View view, WidgetChangeListener updateListener) {
        super(view, updateListener);
        this.setTopicTypeList(Arrays.asList(view.getResources().getStringArray(R.array.camera_msg_types)));

        Log.i(TAG, "init");
    }
}
