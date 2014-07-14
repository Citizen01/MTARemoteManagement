package com.mtasa.android.adapters;

import java.util.List;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.mtasa.android.R;
import com.mtasa.android.entities.Server;

public class ServersAdapter extends ArrayAdapter<Server> {
	private static final String TAG = ServersAdapter.class.getName();

	private Activity context;
	private List<Server> servers;

	static class ViewHolder {
		//		public ImageView logo;
		public TextView name;
		public TextView ip;
		public TextView status;
		public TextView players;
		public TextView gamemode;
	}

	public ServersAdapter(Activity context, List<Server> servers) {
		super(context, R.layout.home_serverlist_item, servers);
		this.context = context;
		this.servers = servers;
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {
		// reuse views
		if (view == null) {
			LayoutInflater inflater = this.context.getLayoutInflater();
			view = inflater.inflate(R.layout.home_serverlist_item, null);
			// configure view holder
			ViewHolder viewHolder = new ViewHolder();
			//			viewHolder.logo = (ImageView) view.findViewById(R.id.serverlist_item_logo);
			viewHolder.name = (TextView) view.findViewById(R.id.serverlist_item_name_value);
			viewHolder.ip = (TextView) view.findViewById(R.id.serverlist_item_ip_value);
			viewHolder.status = (TextView) view.findViewById(R.id.serverlist_item_status_value);
			viewHolder.players = (TextView) view.findViewById(R.id.serverlist_item_players_value);
			viewHolder.gamemode = (TextView) view.findViewById(R.id.serverlist_item_gamemode_value);
			view.setTag(viewHolder);
		}

		// fill data
		ViewHolder holder = (ViewHolder) view.getTag();
		Server s = this.servers.get(position);
		if (s != null) {
			//			holder.logo.setImageResource(R.drawable.ic_multi_theft_auto_logo);

			String name = s.getName();
			holder.name.setText(name != null ? name : "Unknown");

			holder.ip.setText(s.getFullIp());

			String status = s.isOnline() ? "Online" : "Offline";
			holder.status.setText(status != null ? status : "Unknown");

			holder.players.setText(s.getPlayerCount() + "/" + s.getMaxPlayers());

			String gamemode = s.getGamemode();
			holder.gamemode.setText(gamemode != null ? gamemode : "Unknown");
		} else {
			Log.e(TAG, "Failed to get the server in the listview for position " + position);
		}

		return view;
	}

}
