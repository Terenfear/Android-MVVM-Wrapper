<?xml version="1.0" encoding="utf-8"?>
<layout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:attr="http://schemas.android.com/apk/res-auto">

    <data>
        <variable
            name="model"
            type="${packageName}.${viewDataDir}.${viewDataClass}"/>
    </data>

    <LinearLayout
        android:orientation="vertical"
        android:layout_width="match_parent"
        android:layout_height="match_parent">
        <TextView
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            attr:text="@{model.text}"/>
    </LinearLayout>

</layout>
