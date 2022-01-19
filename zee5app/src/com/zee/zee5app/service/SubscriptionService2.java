package com.zee.zee5app.service;

import com.zee.zee5app.dto.Subscription;
import com.zee.zee5app.repository.SubscriptionRepository;


public class SubscriptionService2 {

	private SubscriptionRepository repository = SubscriptionRepository.getInstance();
	private SubscriptionService() {
		
	}
static SubscriptionService service = null;

public static SubscriptionService getInstance() {
	if(service==null) {
		service = new SubscriptionService();
	}
	return service;
}
public String addSubscription(Subscription subscription) {
	return this.repository.addSubscription(subscription);
}
public Subscription getSubscriptionById(String id) {
	return repository.getSubscriptionById(id);
}
public Subscription[] getSubscriptions() {
	return repository.getSubscriptions();
	
}
public String updateSubscription(String id , Subscription subscription) {
	return repository.updateSubscription(id, subscription);
}
public String deleteSubscription(String id) {
	return repository.deleteSubscription(id);
}
}


