package com.mtasa.android.fragments;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.mtasa.android.R;
import com.mtasa.android.adapters.ServersAdapter;
import com.mtasa.android.entities.Server;

/**
 * A placeholder fragment containing a simple view.
 */
public class HomeFragment extends Fragment {
	private ListView serverlist;

	private ArrayList<Server> servers = new ArrayList<Server>();

	public HomeFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_home, container,
				false);

		this.serverlist = (ListView) rootView.findViewById(R.id.home_serverlist);

		//Testing serverlist:
		for (int i = 0; i < 50; i++) {
			Server s = new Server(
					i,
					"Server#" + (i+1),
					"89.3.215.25",
					22003 + (i*10),
					"pass" + i,
					i*10,
					1024,
					"raceV1." + (i+1),
					"1.4");
			this.servers.add(s);
		}


		this.serverlist.setAdapter(new ServersAdapter(getActivity(), this.servers));

		return rootView;
	}
}