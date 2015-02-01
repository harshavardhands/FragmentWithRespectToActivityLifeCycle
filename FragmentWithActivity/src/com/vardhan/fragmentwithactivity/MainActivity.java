package com.vardhan.fragmentwithactivity;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("CHECK", "MainActivity onCreate");
		setContentView(R.layout.activity_main);
		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.d("CHECK", "MainActivity onStart");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.d("CHECK", "MainActivity onResume");
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d("CHECK", "MainActivity onRestart");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.d("CHECK", "MainActivity onStop");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d("CHECK", "MainActivity onDestory");
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public void onAttach(Activity activity) {
			super.onAttach(activity);
			Log.d("CHECK", "Fragment onAttach");
		}

		View rootView;

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			Log.d("CHECK", "Fragment onCreateView");
			return rootView;
		}

		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			Log.d("CHECK", "Fragment onCreate");
		}

		@Override
		public void onViewCreated(View view, Bundle savedInstanceState) {
			super.onViewCreated(view, savedInstanceState);
			Log.d("CHECK", "Fragment onViewCreate");
		}

		@Override
		public void onActivityCreated(Bundle savedInstanceState) {
			super.onActivityCreated(savedInstanceState);
			Log.d("CHECK", "Fragment onActivityCreated");
		}

		@Override
		public void onStart() {
			super.onStart();
			Log.d("CHECK", "Fragment onStart");
		}

		@Override
		public void onResume() {
			super.onResume();
			Log.d("CHECK", "Fragment onResume");

			rootView.findViewById(R.id.button1).setOnClickListener(
					new OnClickListener() {

						@Override
						public void onClick(View v) {
							startActivity(new Intent(getActivity(),
									SecondActivity.class));
						}
					});
		}

		@Override
		public void onStop() {
			super.onStop();
			Log.d("CHECK", "Fragment onStop");
		}

		@Override
		public void onDestroy() {
			super.onDestroy();
			Log.d("CHECK", "Fragment onDestory");
		}

		@Override
		public void onDestroyView() {
			super.onDestroyView();
			Log.d("CHECK", "Fragment onDestroyView");
		}

		@Override
		public void onDetach() {
			super.onDetach();
			Log.d("CHECK", "Fragment onDetach");
		}

	}
}
