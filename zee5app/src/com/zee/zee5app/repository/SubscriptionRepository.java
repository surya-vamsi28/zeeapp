package com.zee.zee5app.repository;

import com.zee.zee5app.dto.Subscription;

public class SubscriptionRepository {
	
	private Subscription[] subscriptions = new Subscription[10];
	private static int count = -1;
	private SubscriptionRepository() {
		
	}
	private static SubscriptionRepository subscriptionRepository;
	public static SubscriptionRepository getInstance() {
		if(subscriptionRepository==null)
			subscriptionRepository = new SubscriptionRepository();
		return subscriptionRepository;
	}
	
	public String addSubscription(Subscription subscription) {
		if(count == subscriptions.length-1) {
			Subscription temp[] = new Subscription[subscriptions.length*2];
			
			System.arraycopy(subscriptions, 0, temp, 0, subscriptions.length);
			subscriptions = temp;
			subscriptions[++count] = subscription;
			return "array is full";
		}
		subscriptions[++count] = subscription;
		return "success";
		}
	public Subscription[] getSubscriptions() {
		return subscriptions;
		
	}

	
	public Subscription getSubscriptionById(String id) 
	{
		for (Subscription subscription : subscriptions) {
			if(subscription!= null && subscription.getSub_id().equals(id)  ) {
				return( subscription);
			}
		}
		return(null);
	}
	
	
	public String updateSubscription(String id ,  Subscription subscription1) {
		int count1 = 0;
		for (Subscription subscription : subscriptions) {
			if(subscription!= null && subscription.getSub_id().equals(id)) {
				subscriptions[count1] = subscription1;
				return("Completed");
			}
			count1++;
			
		}
		return("Not Completed");
		
	}

	public String deleteSubscription(String id) {
		int count1 = 0;
		for (Subscription subscription : subscriptions) {
			
			if(subscription!= null && subscription.getSub_id().equals(id)  ) {
				System.arraycopy(subscriptions, count1+1, subscriptions, count1, subscriptions.length-count1-1);
				subscriptions[subscriptions.length-1] = null;
				return("Completed");
			}
			count1++;
		}
		
		return("Not Completed");
	}


	
	
	
	
	
	

}
